require 'prime'

def get_largest_prime_factor(num)
  prime_factors = Prime.prime_division(num)
  
  prime_factors.max.max
end

puts get_largest_prime_factor(600851475143)

