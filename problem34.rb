class Integer
  def fact
    value = 1
    (1..self).each { |n| value *= n }
    value
  end
end


