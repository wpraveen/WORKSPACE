#include <stdio.h>
#include <stdlib.h>


struct Person {
  int age;
};
 
 
void incrementAge(struct Person *person) {

    Person person1;
    person1.age = 40;
    person = person1;
    //person->age = 30;
    

}
 
int main()
{
    struct Person person;
    person.age = 29;  
    printf("Person age is: %d\n", person.age);
    incrementAge(&person);
    printf("Person age is: %d\n", person.age);
}