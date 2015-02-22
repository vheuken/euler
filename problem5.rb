def divisible?(num, divisor)
  num % divisor == 0
end

found = false
n = 20

until found do
  n = n + 20

  (1..20).each do |i|
    if !divisible?(n, i)
      break
    elsif i == 20
      found = true
    end
  end
end

puts n
