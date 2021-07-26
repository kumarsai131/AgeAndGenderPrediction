int max = Integer.MIN_VALUE;
int curr = 0;
for(int i=0;i<array.size;i++){
    curr += array[i];
    if(curr>max)
    max = curr;

    if(curr<0)
    curr = 0;
}
System.out.println(max);