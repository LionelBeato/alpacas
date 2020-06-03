#!/bin/bash
#simple script file that shows how I created this directory, feel free to ignore this!

clear

echo "Hello World!"

DIRECTORY=`pwd`
let counter=1
let next=$counter+1

mkdir week-{1..8}

for week in week-*; do
	cd $week
	mkdir day-$counter day-$next
	for day in day-*; do 
		cd $day
		echo "---------------------"
		echo "Making an md file in $day"
		echo "position: $day"
		pwd
		echo "

# DATE, 2020 - Day $day


## Agenda



## Outline

| Time   | Objective                        |
| -------|:---------------------------------|
| 6:00p  | Roll Call and settling in        |
| 6:10p  | Slides and examples              |
| 7:30p  | Break                            |
| 7:40p  | Slides wrap-up                   |
| 8:00p  | Assignment                       |
| 8:50p  | Retrospective                    |
| 9:00p  | Class is dismissed!              |


## Lab


## Hand in Assignments
>these are expected to be handed in through TiTuS.



### HTML Review


## Notes and Links


## Quote of the Day 

\`\`\`
`fortune | cowsay`

\`\`\`" >> OVERVIEW.md
		let counter=$next
		let next=$counter+1
		cd $DIRECTORY/$week
		done 
	cd $DIRECTORY
done
