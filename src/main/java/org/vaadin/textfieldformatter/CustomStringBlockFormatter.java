package org.vaadin.textfieldformatter;

import java.util.ArrayList;

import com.vaadin.annotations.JavaScript;
import com.vaadin.server.AbstractJavaScriptExtension;
import com.vaadin.ui.AbstractTextField;

@JavaScript({ "cleave.min.js", "connector.js" })
public class CustomStringBlockFormatter extends AbstractJavaScriptExtension {

	/**
	 * Creates an instance of CustomStringBlockFormatter. Call extend to attach this
	 * formatter to a TextField.
	 * 
	 * @param blocks
	 *            an array configuring the character blocks. The length of the array
	 *            is the number of character blocks. The integers in the array are
	 *            the length of the blocks.
	 * @param delimiters
	 *            the delimiter characters to be used between the character blocks
	 * @param forceCase
	 *            enumeration to control letter case of characters. One of
	 *            ForceCase.NONE don't touch letter case. ForceCase.LOWER transform
	 *            characters to lower case. ForceCase.UPPER transform characters to
	 *            upper case.
	 * @param prefix
	 *            String prefix for the input
	 * @param numericOnly
	 *            true for allowing numeric characters only. Defaults to false.
	 */
	public CustomStringBlockFormatter(int[] blocks, String[] delimiters, ForceCase forceCase, String prefix,
			boolean numericOnly) {
		getState().formatBlocks = blocks;
		getState().delimiters = delimiters;
		if (forceCase == ForceCase.UPPER) {
			getState().lowercase = false;
			getState().uppercase = true;
		} else if (forceCase == ForceCase.LOWER) {
			getState().lowercase = true;
			getState().uppercase = false;
		}
		getState().prefix = prefix;
		getState().numericOnly = numericOnly;
	}

	public CustomStringBlockFormatter(Options options) {
		this(options.blocks, options.delimiters, options.forceCase, options.prefix, options.numericOnly);
	}

	@Override
	protected CustomStringBlockFormatterState getState() {
		return (CustomStringBlockFormatterState) super.getState();
	}

	/**
	 * Adds this extension to a AbstractTextField. Extension cannot be moved to
	 * another TextField again.
	 */
	public void extend(AbstractTextField textField) {
		super.extend(textField);
	}

	public enum ForceCase {
		NONE, UPPER, LOWER
	}

	public static class Builder {
		private String prefix;
		private ForceCase _case;
		private boolean numeric;
		private final ArrayList<String> delimiters = new ArrayList<>();
		private final ArrayList<Integer> blocks = new ArrayList<>();

		/**
		 * Creates prefix as the first block and delimiter. This will replaced
		 * previously set prefix block. This will prepend any previously set normal
		 * blocks.
		 * 
		 * @param prefix
		 *            String prefix to use. Cannot be null or empty.
		 * @param delimiter
		 *            String delimiter after the prefix block. Cannot be null or empty.
		 * @return this Builder
		 */
		public Builder prefix(String prefix, String delimiter) {
			if (prefix == null || prefix.isEmpty())
				throw new IllegalArgumentException("Prefix cannot be null or empty.");
			if (delimiter == null || delimiter.isEmpty())
				throw new IllegalArgumentException("Delimiter cannot be null or empty.");
			this.prefix = prefix;
			blocks.add(0, prefix.length());
			delimiters.add(0, delimiter);
			return this;
		}

		/**
		 * Appends a block with a given block length and delimiter character. If this is
		 * the last block, the delimiter will be ignored.
		 * 
		 * @param blockLength
		 *            int block length
		 * @param delimiter
		 *            String delimiter after block. Cannot be null or empty.
		 * @return this Builder
		 */
		public Builder block(int blockLength, String delimiter) {
			if (delimiter == null || delimiter.isEmpty())
				throw new IllegalArgumentException("Delimiter cannot be null or empty.");
			blocks.add(blockLength);
			delimiters.add(delimiter);
			return this;
		}

		/**
		 * Appends the blocks with a given block lengths.
		 * 
		 * @param blockLengths
		 *            int[] block lengths
		 * @return this Builder
		 */
		public Builder blocks(int... blockLengths) {
			if (blockLengths == null)
				throw new IllegalArgumentException("Block lengths cannot be null.");
			for (int block : blockLengths) {
				blocks.add(block);
			}
			return this;
		}

		/**
		 * Appends the blocks with a given block lengths.
		 * 
		 * @param delimiters
		 *            String[] delimiters to be used. Cannot be null.
		 * @return this Builder
		 */
		public Builder delimiters(String... delimiters) {
			if (delimiters == null)
				throw new IllegalArgumentException("Delimiters cannot be null.");
			for (String delimiter : delimiters) {
				this.delimiters.add(delimiter);
			}
			return this;
		}

		/**
		 * Allows only numeric characters. Default is allowing any character.
		 * 
		 * @return this Builder
		 */
		public Builder numeric() {
			numeric = true;
			return this;
		}

		/**
		 * Sets the forced letter casing of characters.
		 * 
		 * @param _case
		 *            enumeration to control letter case of characters. ForceCase.NONE
		 *            don't touch letter case. ForceCase.LOWER transform characters to
		 *            lower case. ForceCase.UPPER transform characters to upper case.
		 * @return this Builder
		 */
		public Builder forceCase(ForceCase _case) {
			this._case = _case;
			return this;
		}

		public CustomStringBlockFormatter build() {
			return new CustomStringBlockFormatter(buildOptions());
		}

		public Options buildOptions() {
			Options options = new Options();
			options.setForceCase(_case);
			options.setNumericOnly(numeric);
			options.setPrefix(prefix);
			if (!blocks.isEmpty() && !delimiters.isEmpty()) {
				options.setBlocks(blocks.stream().mapToInt(Integer::valueOf).toArray());
				delimiters.stream().limit(delimiters.size() - 1).toArray();
				options.setDelimiters(
						delimiters.subList(0, delimiters.size() - 1).toArray(new String[delimiters.size() - 1]));
			}
			return options;
		}
	}

	public static class Options {
		private int[] blocks;
		private String[] delimiters = null;
		private ForceCase forceCase = ForceCase.NONE;
		private boolean numericOnly = false;
		private String prefix;

		public Options(int[] blocks, String[] delimiters, ForceCase forceCase, String prefix, boolean numericOnly) {
			this.blocks = blocks;
			this.delimiters = delimiters;
			this.forceCase = forceCase;
			this.prefix = prefix;
			this.numericOnly = numericOnly;
		}

		public Options(Options options) {
			this(options.blocks, options.delimiters, options.forceCase, options.prefix, options.numericOnly);
		}

		public Options() {

		}

		public int[] getBlocks() {
			return blocks;
		}

		public void setBlocks(int... blocks) {
			this.blocks = blocks;
		}

		public String[] getDelimiters() {
			return delimiters;
		}

		public void setDelimiters(String... delimiters) {
			this.delimiters = delimiters;
		}

		public ForceCase getForceCase() {
			return forceCase;
		}

		public void setForceCase(ForceCase forceCase) {
			this.forceCase = forceCase;
		}

		public String getPrefix() {
			return prefix;
		}

		public void setPrefix(String prefix) {
			this.prefix = prefix;
		}

		public boolean isNumericOnly() {
			return numericOnly;
		}

		public void setNumericOnly(boolean numericOnly) {
			this.numericOnly = numericOnly;
		}
	}
}
