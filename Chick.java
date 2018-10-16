class Chick implements Animal 
{     
    private String myType;
    private String mySound1;
    private String mySound2;
    public Chick(String type, String childishSound, String grownUpSound){
    	myType = type;
    	mySound1 = childishSound;
    	mySound2 = grownUpSound;
    }
    public String getSound(){
    	int randomInt = (int)(Math.random()*2);
    	if (randomInt%2 == 0) {
    		return mySound1;
    	}else{
    		return mySound2;
    	}
    }
    public String getType(){
    	return myType;
    }
}
