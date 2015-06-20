package classDesign;

public class GoodOne{

int theval;

public int hashCode()
{
return theval%3;
}
public boolean equals (Object obj)
{
try{
return this==obj? true : ( theval%3 == 0 && ((GoodOne)obj). theval%3==0) ? true : false;
}
catch(Exception e)
{
return false;
}
}
}