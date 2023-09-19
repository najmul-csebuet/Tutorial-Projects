# Product Interface
class Product
  def operation
    raise NotImplementedError, "#{self.class} must implement #operation method"
  end
end

# Concrete Products
class ConcreteProductA < Product
  def operation
    "Result of ConcreteProductA"
  end
end

class ConcreteProductB < Product
  def operation
    "Result of ConcreteProductB"
  end
end

# Creator Class (Factory)
class Creator
  def factory_method
    raise NotImplementedError, "#{self.class} must implement #factory_method"
  end

  def some_operation
    product = factory_method
    "Creator: #{product.operation}"
  end
end

# Concrete Creators
class ConcreteCreatorA < Creator
  def factory_method
    ConcreteProductA.new
  end
end

class ConcreteCreatorB < Creator
  def factory_method
    ConcreteProductB.new
  end
end

# Client Code
creator_a = ConcreteCreatorA.new
puts creator_a.some_operation

creator_b = ConcreteCreatorB.new
puts creator_b.some_operation
