# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class DecoratedRelation(Base):
    __tablename__ = "decorated_relation"

    decorator_oid = Column(Integer, primary_key=True)
    decorated_element_oid = Column(Integer, nullable=False)
