#!/bin/bash

clear

echo "Hello World!"

let counter=1
let next=$counter+1

for folder in week-*; do
	cd $folder
	for i in $counter $next; do 
		echo "Making an md file in $folder"
		echo "---------------------"
		echo "position: $i"
		touch day-$i.md
		let counter=$next
		let next=$counter+1
		done 
	cd ..
done
