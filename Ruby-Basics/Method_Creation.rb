def hi
  puts "Bismillah"
end

def hi1(name)
  puts "Hello #{name}!"
end

def hi2(name = "woRld")
  puts "Hello #{name.capitalize}!"
end

hi
hi()

hi1("Saad")
hi1 "Saad"

hi2
