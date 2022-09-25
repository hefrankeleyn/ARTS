
// 三路快排
function threeWayQuickSort(a) {
    if (!a || a.length==0) {
        return;
    }
    shuffle(a);
    sort(a, 0, a.length-1);
}

// 打乱 a 的顺序， 避免极端的情况
function shuffle(a) {
    for (let i=0; i<a.length; i++) {
        let j = Math.floor(Math.random() * (a.length-i))
        exch(a, i, i+j);
    }
}


function sort(a, lo, hi) {
    if (lo>=hi) return;

    let eq = lo;
    let left = lo+1;
    let right = hi;
    while (left<=right) {
        if (less(a, eq, left)) {
            exch(a, left, right);
            right--;
        } else if (less(a, left, eq)) {
            exch(a, left, eq);
            eq++;
            left++;
        } else {
            left++;
        }
    }
    sort(a, lo, eq-1);
    sort(a, left, hi);
}

function less(a, i, j) {
    if (a[i]<a[j]) {
        return true;
    }else {
        return false;
    }
}

function exch(a, i, j) {
    let t = a[i];
    a[i] = a[j];
    a[j] = t; 
}

let a = [3, 6, 1, 2, 9, 0, 1, 2, 3, 3, 3, 1, 2, 0, 0, 9]
console.log(a);
threeWayQuickSort(a);
console.log(a);

