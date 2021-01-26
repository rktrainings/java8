var BigDecimal = Java.type('java.math.BigDecimal');

function calculate(amount, percentage) {

   var result = new BigDecimal(amount).multiply(new BigDecimal(percentage)).divide(
      new BigDecimal("100"), 2, BigDecimal.ROUND_HALF_EVEN);
   
   return result.toPlainString();
}
var result = calculate(568000000000000000023,13.9);
print(result);

//Open the console and use the following command.
//C:\Users\RavikumarPothannagar\git\rktrainings\java8\Java-8\src\com\rktrainings\java8\nashornjavascript>jjs sample.js
