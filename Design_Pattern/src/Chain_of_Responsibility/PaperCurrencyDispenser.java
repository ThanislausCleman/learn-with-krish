package Chain_of_Responsibility;

public abstract class PaperCurrencyDispenser {
	
	protected PaperCurrencyDispenser nextDispenser;

    public void setNextDispenser(PaperCurrencyDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    public abstract void dispense(PaperCurrency currency);

}
