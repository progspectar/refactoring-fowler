public  class  Movie  {

    public  static  final  int  CHILDRENS  =  2;
    public  static  final  int  REGULAR  =  0;
    public  static  final  int  NEW_RELEASE  =  1;

    private  String  _title;
    private  int  _priceCode;

    public  Movie(String  title,  int  priceCode)  {
        _title  =  title;
        _priceCode  =  priceCode;
    }
    public  int  getPriceCode()  {
        return  _priceCode;
    }

  //  Excerpt From: Fowler, Martin. “Refactoring: Improving the Design of Existing Code.” iBooks.
    public  void  setPriceCode(int  arg)  {
        _priceCode  =  arg;
    }

  //  Excerpt From: Fowler, Martin. “Refactoring: Improving the Design of Existing Code.” iBooks.
    public  String  getTitle  (){
        return  _title;
    };
}