//Write a program to print the corresponding grade for the given mark using if..else statement 

#include <stdio.h>
int main() {
    int mark;
    printf("Enter your mark: ");
    scanf("%d", &mark);

    if (mark >= 90) {
        printf("Grade: A\n");
    } else if (mark >= 80) {
        printf("Grade: B\n");
    } else if (mark >= 70) {
        printf("Grade: C\n");
    } else if (mark >= 60) {
        printf("Grade: D\n");
    } else {
        printf("Grade: F\n");
    }

    return 0;
}