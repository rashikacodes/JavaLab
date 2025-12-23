

//Write a program to take first name and last name from user and print both in one line as last name followed by first name
#include <stdio.h>
int main() {
    char firstName[50], lastName[50];
    printf("Enter your first name: ");
    scanf("%s", firstName);
    printf("Enter your last name: ");
    scanf("%s", lastName);
    printf("Full Name: %s %s\n", lastName, firstName);
    return 0;
}