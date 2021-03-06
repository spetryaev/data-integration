PGDMP     5    ;            	    w            postgres    11.5    11.5     �
           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            �
           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            �
           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false                        1262    13012    postgres    DATABASE     �   CREATE DATABASE postgres WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United States.1252' LC_CTYPE = 'English_United States.1252';
    DROP DATABASE postgres;
             postgres    false                       0    0    DATABASE postgres    COMMENT     N   COMMENT ON DATABASE postgres IS 'default administrative connection database';
                  postgres    false    2816            �            1259    16419    provider    TABLE     �   CREATE TABLE public.provider (
    id integer NOT NULL,
    customer_name character varying(50),
    account_name character varying(50),
    traffic_volume_gb double precision,
    address character varying(50),
    date timestamp without time zone
);
    DROP TABLE public.provider;
       public         postgres    false            �            1259    16417    provider_id_seq    SEQUENCE     �   CREATE SEQUENCE public.provider_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.provider_id_seq;
       public       postgres    false    198                       0    0    provider_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.provider_id_seq OWNED BY public.provider.id;
            public       postgres    false    197            }
           2604    16422    provider id    DEFAULT     j   ALTER TABLE ONLY public.provider ALTER COLUMN id SET DEFAULT nextval('public.provider_id_seq'::regclass);
 :   ALTER TABLE public.provider ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    198    197    198            �
          0    16419    provider 
   TABLE DATA               e   COPY public.provider (id, customer_name, account_name, traffic_volume_gb, address, date) FROM stdin;
    public       postgres    false    198   �                  0    0    provider_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.provider_id_seq', 134, true);
            public       postgres    false    197            
           2606    16424    provider provider_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.provider
    ADD CONSTRAINT provider_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.provider DROP CONSTRAINT provider_pkey;
       public         postgres    false    198            �
   ]  x����j�0�ך��D����v��6�6�E��-����c/��Ռ-Y����ߜ{ι�`E�M�������׷�I��BA�'Fu�:����ơ�G�:�Brc�E[����؊������.�@A�F� @E�ԝ�C���W�g��+��nz�4!S�%�����B<L�ױ�	+M� gM����q���'%&[�d,�ͭ�]�~?���we���/��_1���q��uTŗ:�}�*����w*����s�?�"樬���5��4�7� �8��#-��n?u�4���d�<ji��u��~J�a�]t�H:6��u��g�Y�$���Hn �.C�(��@���X� �C44G�x����!�����ͻ��`p�>�w���)ɳ^�Ǹ�����1�2X(����T�Z��
���.�gN+�Z�Q�TЂ`���r��&�Hw6/�tt�I+����4k�5X�6���\[QHE�"�k�u[�Q�:��F{�!8*�y�>|�͗�57�$��!�֛!�­
�q�	�����dc�^���G���G��IL�Ŗ`��]�K�x��&E-֗�6/�~��|���D��n����R     