����   4 4  Offer/Q19_顺时针打印矩阵  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this !LOffer/Q19_顺时针打印矩阵; printMatrix ([[I)Ljava/util/ArrayList; 	Signature /([[I)Ljava/util/ArrayList<Ljava/lang/Integer;>;  java/util/ArrayList
  	
    java/lang/Integer   valueOf (I)Ljava/lang/Integer;
     add (Ljava/lang/Object;)Z matrix [[I row I col list Ljava/util/ArrayList; left top bottom right i j t k LocalVariableTypeTable *Ljava/util/ArrayList<Ljava/lang/Integer;>; StackMapTable   
SourceFile Q19_顺时针打印矩阵.java !               /     *� �    
                               9  
   �+�=+2�>� � �� Y� :66d6d6� �6	� +2	.� � W�		���`6	� +	2.� � W�		���� &d6	� +2	.� � W�	�	���� &d6	� +	2.� � W�	�	��������� 
��Q�    
   n        	  
     +  .  5  E  O  X  h  r  y  �  �  �  �  �  �  �   � ! � " � # �  � %    �    �       �      � ! "   � # "   � $ %   � & "  ! � ' "  & � ( "  + � ) "  2  * " 	 U  + " 	   , " 	 �  - " 	 .      � $ /  0   4 � �  	  1   � � � �   2    3