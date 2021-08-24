#include <stdio.h>
#include <stdlib.h>

struct {
    int a : 2;
    unsigned int b : 1;
} bitFields;

int main() {
    char str[100];
    int a;
    //scanf("%s%d", str, &a);
    printf("%s\n", __DATE__);
    printf("%s\n", __TIME__);
    printf("%s\n", __FILE__);
    printf("%d\n", __LINE__);
    printf("%d\n", __STDC__);
    exit(EXIT_SUCCESS);
    //return 0;
}
