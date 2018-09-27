package week2.task2;

public final class Fraction {
    private int numerator;
    private int denominator;
    
    // setNumerator
    void setNumerator( int n ) {
        this.numerator = n;
    }
    // setDenominator
    void setDenominator( int d ) {
        this.denominator = d;
    }
    // getNumerator
    public int getNumerator() {
        return numerator;
    }
    // getDenominator
    public int getDenominator() {
        return denominator;
    }
    // TODO: khai báo các thuộc tính

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.setNumerator(numerator);
        this.setDenominator(denominator);
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction add = new Fraction(0,1); 
        
        int a = this.getDenominator(); 
        
        int n = this.getNumerator()* other.getDenominator(); 
        
        int d = a*other.getDenominator(); 
        
        add.setNumerator(n + a*other.getNumerator()); 
        
        add.setDenominator(d);    
        
        return add;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction sub = new Fraction(0,1); 
        
        int a = this.getDenominator(); 
        
        int n = this.getNumerator()* other.getDenominator(); 
        
        int d = a* other.getDenominator(); 
        
        sub.setNumerator(n - a*other.getNumerator()); 
        
        sub.setDenominator(d);   
        
        return sub;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        
        Fraction mul = new Fraction(0,1); 
        
        mul.setNumerator(this.getNumerator()*other.getNumerator()); 
        
        mul.setDenominator(this.getDenominator()*other.getDenominator());
        
        return mul;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction div = new Fraction(0,1); 
        
        div.setNumerator(this.getNumerator()*other.getDenominator()); 
        
        div.setDenominator(this.getDenominator()*other.getNumerator()); 
        
        return div;
    }
    
    /**
     * 
     * @return 
     */

    public boolean equals(Object other) {
        Fraction a =(Fraction)other;
        boolean check = false;
        if( this.getNumerator()*a.getDenominator()) - (this.getDenominator() * a.getNumerator() == 0) check = true; 
        return check;
    }
}
