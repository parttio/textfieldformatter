#!/bin/bash
input="codes.txt"
regex="(cleave-phone)\.([a-z\-]+)\.js"

while IFS= read -r line
do
   if [[ "$line" =~ $regex ]]
   then
       code="${BASH_REMATCH[2]}"
       cat PhoneFieldFormatterConstantsTemplate.txt | sed s/#codeuc#/${code^^}/g | sed '$s/$/\n/' >> "region-constants.txt"
   fi
done < "$input"
