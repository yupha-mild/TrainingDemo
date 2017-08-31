class Hello {
    
    public Hello() {
        System.out.println("Hello! We are:");
	this.Krerk();
		this.Mild();
    }
    
    private void Krerk() {
        System.out.println("Trainer - Krerk Piromsopa, Ph.D.");
    }
    private void Mild() {
        System.out.println("Trainee - Yuphaphorn Wiwekwaew");
    }
    public static void main(String [] argv) {
        new Hello();
    }
}