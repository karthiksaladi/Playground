#include <stdio.h>
int main() {
	//Type your code
  int n,m=3;
  int i;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    printf("%d",i);
    if(i%m==0)
      printf(",");
  }
	return 0;
}