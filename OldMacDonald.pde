
void setup()
{
	Cow cow = new Cow("cow", "moo");
	Chick chicken = new Chick("chick", "cluck");
	Pig pig = new Pig("pig", "oink");
	System.out.println(cow.getType() + " goes " + cow.getSound());
	System.out.println(chicken.getType() + " goes " + chicken.getSound());
	System.out.println(pig.getType() + " goes " + pig.getSound());
	//your variable declarations and
	//System.out.println() statements here
}

