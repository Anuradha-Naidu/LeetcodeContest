// a[] = [2,4,5,8,50,68,72,130,............] target=68

//brute force = linear search, check with each element, T = O(N)
//another brute force = search in constant range, set range = 500 or any, still T = O(N)
//now, instead of constant range, set exponential range to cover max elements 

searchInfinite(int arr[], int key){
  int low =0;
  int high =1;
  while(a[i]<key){ //T = O(log i)
    low = high;
    high = high*2;
  }
  return binarySearch(arr, key, low, high)
    T = O(logn)
