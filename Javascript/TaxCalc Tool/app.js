function getTaxRate() {
    //variable declaration
    var income = parseFloat(document.getElementById('income').value);
    var taxOwed;
    var calculatedTax;

    //determines tax rate based off user input
    if (income <= 27050) {
        taxOwed = .15 * income;
    } else if (income > 27050 && income < 65550) {
        taxOwed = 4057.5 + (.275 * (income - 27050));
    } else if (income > 65550 && income < 136750) {
        taxOwed = 14654 + (.305 * (income - 65550));
    } else if (income > 136750 && income < 297350) {
        taxOwed = 36361 + (.355 * (income - 136750));
    } else if (income > 297350) {
        taxOwed = 93374 + (.391 * (income - 297350));
    } else {
        window.alert("income is out of range")
        taxOwed ="";
    }

    //calculates taxes from user input and tax rate.
    //calculatedTax = taxOwed;
    //console.log(calculatedTax);
    document.taxForm.calculatedTax.value = taxOwed.toFixed(2); //returns value of calculated taxes back to form. 

} 
