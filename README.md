# RoundRobinLinkedList
This java program implements the linked list data structure in order to replicate the process of Round Robin CPU scheduling. 

## What is Round Robin Scheduling?
Round Robin scheduling is a type of CPU process scheduling where there is a particular "Time quantum" each process is run for before moving to the next process. This type of scheduling performs that action in a circular motion until all of the processes are done running (in other words, when the CPU Burst Time Remaining reaches 0). 

## How does this program implement this?
This program starts at the head of the linked list, or the first one created, then it detracts the value of the time quantum from each CPU Burst Time remaining and moves to the next one. When it reaches the end of the list (the tail), it wraps back around to the head again. It is important to note that if the burst time is brought below 0 by the detraction of the time quantum, the CPU burst time is automatically adjusted to 0 to signify that it does not need to be run anymore and is ignored by the code when it is encountered.
