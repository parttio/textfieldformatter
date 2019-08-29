#!/bin/bash
input="codes.txt"
regex="(cleave-phone)\.([a-z\-]+)\.js"

while IFS= read -r line
do
   if [[ "$line" =~ $regex ]]
   then
       code="${BASH_REMATCH[2]}"
       cat PhoneFieldFormatterClassTemplate.txt | sed s/#codeuc#/${code^^}/g | sed s/#codelc#/$code/g > "src/main/java/org/vaadin/textfieldformatter/phone/Phone${code^^}FieldFormatter.java"
   fi
done < "$input"
