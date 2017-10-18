class NamedCow extends Cow
{
  private String myCowName;
  public NamedCow(String type, String CowName, String sound)
  {
    myCowName = CowName; 
    myType = type;
    mySound = sound; 
  }
  public String getName()
  {
    return myCowName; 
  }
}