#DAY8
----------
## 1. 多态
- 多态是什么？事物存在的多种体现形态。
	- 1. 多态的体现：父类引用指向子类对象。
	- 2. 多态的好处：大大提高了程序的扩展性。
	- 3. 多态的前提：必须是继承，或者实现的关系。还有一个前提：存在覆盖
	- 4.多态的弊端，提高了扩展性，但是父类的引用，只能使用父类中的成员。因为父类定义的方法，后期新出来的方法不一定有。
			
				//多态的体现
				class Animal{
					void eat(){}
				}
				class Pig extends Animal{
					void eat(){
						sop("pai eat")；
					}
					void makeSounds(){	
					}
				}
				class Dog extends Animal{
					void eat(){
						sop("pai eat")；
					}
					void kanjai(){
					}
				}
				main (){
					function(new Dog());
					function(new Pig());
					void function(Animal a){
					a.eat();
					}
				}
	- 5.多态的应用
				
				//多态自始至终都是子类对象在变化
				Animal a = new Cat(); //类型提升，向上转型
				Cat c = (Cat)a;//向下转型
			- 判断引用型数据类型 instanceof  ,ex: if(c instanceof Cat),判断的时候不要写父类，例如：instanceof Animal
	- 6.多态函数成员的特点。

				Fu z = new Zi();
				
				
		- 又叫动静态绑定。
		- 对于成员非静态函数：编译能不能通过看左边，运行的时候看右边。
		- 对于成员静态函数:无论编译和运行都参考左边。解释：因为静态方法不需要对象，直接Fu.就可以调用。
		- 对于成员变量：编译和运行都看左边。
		- 对于静态成员变量：参考左边，父类引用，其实就是class。
		- 开发当中，对于非静态函数调用最多，因为有覆盖


## 2.Object类，所有类的父类
- equals(Object o),也是多态的应用。用来判断对象是否相同，可以自定义方法
		
		Person p1 = new person();
		person p2 = new Person();
		//其实比较的是hash值
		sop(p1.equals(p2)); 
- java写类一般覆盖toString() ，equals() ，hashCode()方法。