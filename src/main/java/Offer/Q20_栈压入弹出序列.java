����   4 9  Offer/Q20_栈压入弹出序列  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this !LOffer/Q20_栈压入弹出序列; 
IsPopOrder ([I[I)Z  java/util/Stack
  	
    java/lang/Integer   valueOf (I)Ljava/lang/Integer;
     push &(Ljava/lang/Object;)Ljava/lang/Object;
      pop ()Ljava/lang/Object;
  " #   peek
  % & ' intValue ()I
  ) * + empty ()Z pushA [I popA stack Ljava/util/Stack; j I i LocalVariableTypeTable &Ljava/util/Stack<Ljava/lang/Integer;>; StackMapTable 
SourceFile Q20_栈压入弹出序列.java !               /     *� �    
                               c+�� ,�� �� Y� N66� 5-+.� � W� -� W�,�� -� !� � $,.���,����-� (� � �    
   2     
   
       )  ,  1  4  L  V     >    c       c , -    c . -   O / 0   L 1 2   < 3 2  4      O / 5  6    	
�  � @  7    8