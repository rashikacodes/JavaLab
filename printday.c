//Write a program to print the week day for the given day no. of the current month using switch case statement
#include <stdio.h>
int main() {
    int day;
    printf("Enter day number (1-31): ");
    scanf("%d", &day);
    
    switch(day) {
        case 1:
            printf("Day %d is a Monday\n", day);
            break;
        case 2:
            printf("Day %d is a Tuesday\n", day);
            break;
        case 3:
            printf("Day %d is a Wednesday\n", day);
            break;
        case 4:
            printf("Day %d is a Thursday\n", day);
            break;
        case 5:
            printf("Day %d is a Friday\n", day);
            break;
        case 6:
            printf("Day %d is a Saturday\n", day);
            break;
        case 7:
            printf("Day %d is a Sunday\n", day);
            break;
        default:
            printf("Invalid day number!\n");
    }

    return 0;
}