class Greeter

  def initialize(name = "World")
    @name = name;
  end

  def say_hi
    puts "Hi #{@name}"
  end

  def say_bye
    puts "Bye #{@name}, come again!"
  end

end

greeter = Greeter.new("Pat")

greeter.say_hi
greeter.say_bye

puts "\nputs Greeter.instance_methods"
puts "-----------------------------"
puts Greeter.instance_methods

puts "\nputs Greeter.instance_methods(false)"
puts "-----------------------------"
puts Greeter.instance_methods(false)


puts "\ngreeter.respond_to?()"
puts greeter.respond_to?("name")
puts greeter.respond_to?("say_hi")
puts greeter.respond_to?("say_bye")
puts greeter.respond_to?("to_s")

puts "Altering Classes—It's Never Too Late"

class Greeter
  attr_accessor :name
end

greeterNew = Greeter.new("Andy")
puts greeter.respond_to?("name")
puts greeterNew.respond_to?("name")
puts greeterNew.respond_to?("name=")


greeter.name = "najmul"
greeter.say_hi
greeter.say_bye


class MegaGreeter
  attr_accessor :names

  # Create the object
  def initialize(names = "World")
    @names = names
  end

  # say hi to everybody
  def say_hi
    if @names.nil?
      puts "..."
    elsif @names.respond_to?("each")
      # @names is a list of some kind, iterate!
      @names.each do |name|
        puts "Hello #{name}!"
      end
    else
      puts "Hello #{@names}!"
    end
  end

  # Say bye to everybody
  def say_bye
    if @names.nil?
      puts "..."
    elsif @names.respond_to?("join")
      puts "Goodbye #{@names.join(", ")}. Come back soon!"
    else
      puts "Goodbye #{@names}. Come back soon!"
    end
  end
end

# __FILE__ contains the current file name as a magic variable
# $0 is file name as argument

if __FILE__ == $0
  puts "Testing MegaGreeter"
  mg = MegaGreeter.new
  mg.say_hi
  mg.say_bye

  # Change name to be "Najmul"
  mg.names = "Najmul"
  mg.say_hi
  mg.say_bye

  # Change the name to an array of names
  mg.names = ["Najmul", "Hasan", "Ongkur"]
  mg.say_hi
  mg.say_bye

  # Change to nil
  mg.names = nil
  mg.say_hi
  mg.say_bye

end
