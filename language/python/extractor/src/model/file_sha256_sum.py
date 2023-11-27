# coding: utf-8
from sqlalchemy import Column, Integer, Text
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class FileSha256Sum(Base):
    __tablename__ = "file_sha256_sum"

    file_oid = Column(Integer, primary_key=True)
    value = Column(Text, nullable=False)
